package com.portfolio.my_skill.ServiceImples;

import com.portfolio.my_skill.entity.MySkills;
import com.portfolio.my_skill.exceptions.DataNotFoundException;
import com.portfolio.my_skill.models.MySkillsPayloadDTO;
import com.portfolio.my_skill.models.MySkillsResponseDTO;
import com.portfolio.my_skill.repository.MYSkillRepo;
import com.portfolio.my_skill.services.MySkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MySkillServiceImplement implements MySkillService {
    @Autowired
    private MYSkillRepo repo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<MySkillsResponseDTO> getAll() {
        List<MySkills> documentsList = this.repo.findAll();
        return documentsList.stream().map(e -> this.modelMapper.map(e, MySkillsResponseDTO.class)).collect(Collectors.toList());
    }

    @Override
    public MySkillsResponseDTO getById(int id) {
        MySkills getData = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        return this.modelMapper.map(getData, MySkillsResponseDTO.class);
    }

    @Override
    public MySkillsResponseDTO add(MySkillsPayloadDTO payloadDTO) {
        MySkills mySkills = new MySkills();
        mySkills.setIcon(payloadDTO.getIcon());
        mySkills.setName(payloadDTO.getName());
        mySkills.setDescription(payloadDTO.getDescription());
        mySkills.setSkillKnowledge(payloadDTO.getSkillKnowledge());
        mySkills.setTechType(payloadDTO.getTechType());
        MySkills savedDate = this.repo.save(mySkills);
        return this.modelMapper.map(savedDate, MySkillsResponseDTO.class);
    }

    @Override
    public MySkillsResponseDTO updateById(MySkillsPayloadDTO payloadDTO, int id) {
        MySkills mySkills = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        mySkills.setIcon(payloadDTO.getIcon());
        mySkills.setName(payloadDTO.getName());
        mySkills.setDescription(payloadDTO.getDescription());
        mySkills.setSkillKnowledge(payloadDTO.getSkillKnowledge());
        mySkills.setTechType(payloadDTO.getTechType());
        MySkills savedDate = this.repo.save(mySkills);
        return this.modelMapper.map(savedDate, MySkillsResponseDTO.class);
    }

    @Override
    public boolean deleteById(int id) {
        MySkills documents = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        this.repo.deleteById(documents.getId());
        return true;
    }
}
