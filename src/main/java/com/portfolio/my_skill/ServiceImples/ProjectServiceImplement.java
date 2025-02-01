package com.portfolio.my_skill.ServiceImples;

import com.portfolio.my_skill.entity.Project;
import com.portfolio.my_skill.exceptions.DataNotFoundException;
import com.portfolio.my_skill.models.ProjectPayload;
import com.portfolio.my_skill.models.ProjectResponse;
import com.portfolio.my_skill.repository.ProjectRepo;
import com.portfolio.my_skill.services.ProjectService;
import com.portfolio.my_skill.services.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImplement implements ProjectService {
    @Autowired
    private ProjectRepo repo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProjectResponse> getAll() {
        List<Project> documentsList = this.repo.findAll();
        return documentsList.stream().map(e -> this.modelMapper.map(e, ProjectResponse.class)).collect(Collectors.toList());
    }

    @Override
    public ProjectResponse getById(int id) {
        Project getData = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        return this.modelMapper.map(getData, ProjectResponse.class);
    }

    @Override
    public ProjectResponse add(ProjectPayload payloadDTO) {
        Project Project = new Project();
        Project.setProjectName(payloadDTO.getProjectName());
        Project.setType(payloadDTO.getType());
        Project.setServiceType(payloadDTO.getServiceType());
        Project.setDescription(payloadDTO.getDescription());
        Project savedDate = this.repo.save(Project);
        return this.modelMapper.map(savedDate, ProjectResponse.class);
    }

    @Override
    public ProjectResponse updateById(ProjectPayload payloadDTO, int id) {
        Project Project = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        Project.setProjectName(payloadDTO.getProjectName());
        Project.setType(payloadDTO.getType());
        Project.setServiceType(payloadDTO.getServiceType());
        Project.setDescription(payloadDTO.getDescription());
        Project savedDate = this.repo.save(Project);
        return this.modelMapper.map(savedDate, ProjectResponse.class);
    }

    @Override
    public boolean deleteById(int id) {
        Project data = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        this.repo.deleteById(data.getId());
        return true;
    }
}
