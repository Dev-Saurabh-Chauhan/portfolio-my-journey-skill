package com.portfolio.my_skill.services;

import com.portfolio.my_skill.models.MyJourneyPayloadDto;
import com.portfolio.my_skill.models.MyJourneyResponseDto;
import com.portfolio.my_skill.models.ProjectPayload;
import com.portfolio.my_skill.models.ProjectResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectResponse> getAll();

    ProjectResponse getById(int id);

    ProjectResponse add(ProjectPayload payloadDTO);

    ProjectResponse updateById(ProjectPayload payloadDTO, int id);

    boolean deleteById(int id);

}
