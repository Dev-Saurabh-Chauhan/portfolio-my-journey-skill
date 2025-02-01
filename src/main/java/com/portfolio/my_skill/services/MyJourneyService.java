package com.portfolio.my_skill.services;

import com.portfolio.my_skill.models.MyJourneyPayloadDto;
import com.portfolio.my_skill.models.MyJourneyResponseDto;

import java.util.List;

public interface MyJourneyService {
    List<MyJourneyResponseDto> getAll();

    MyJourneyResponseDto getById(int id);

    MyJourneyResponseDto add(MyJourneyPayloadDto payloadDTO);

    MyJourneyResponseDto updateById(MyJourneyPayloadDto payloadDTO, int id);

    boolean deleteById(int id);

}
