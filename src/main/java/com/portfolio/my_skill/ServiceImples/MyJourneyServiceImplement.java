package com.portfolio.my_skill.ServiceImples;

import com.portfolio.my_skill.entity.MyJourney;
import com.portfolio.my_skill.exceptions.DataNotFoundException;
import com.portfolio.my_skill.models.MyJourneyPayloadDto;
import com.portfolio.my_skill.models.MyJourneyResponseDto;
import com.portfolio.my_skill.repository.MyJourneyRepo;
import com.portfolio.my_skill.services.MyJourneyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyJourneyServiceImplement implements MyJourneyService {
    @Autowired
    private MyJourneyRepo repo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<MyJourneyResponseDto> getAll() {
        List<MyJourney> documentsList = this.repo.findAll();
        return documentsList.stream().map(e -> this.modelMapper.map(e, MyJourneyResponseDto.class)).collect(Collectors.toList());
    }

    @Override
    public MyJourneyResponseDto getById(int id) {
        MyJourney getData = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        return this.modelMapper.map(getData, MyJourneyResponseDto.class);
    }

    @Override
    public MyJourneyResponseDto add(MyJourneyPayloadDto payloadDTO) {
        MyJourney myJourney = new MyJourney();
        myJourney.setCompany(payloadDTO.getCompany());
        myJourney.setRole(payloadDTO.getRole());
        myJourney.setFromDate(payloadDTO.getFromDate());
        myJourney.setToDate(payloadDTO.getToDate());
        MyJourney savedDate = this.repo.save(myJourney);
        return this.modelMapper.map(savedDate, MyJourneyResponseDto.class);
    }

    @Override
    public MyJourneyResponseDto updateById(MyJourneyPayloadDto payloadDTO, int id) {
        MyJourney myJourney = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        myJourney.setCompany(payloadDTO.getCompany());
        myJourney.setRole(payloadDTO.getRole());
        myJourney.setFromDate(payloadDTO.getFromDate());
        myJourney.setToDate(payloadDTO.getToDate());
        MyJourney savedDate = this.repo.save(myJourney);
        return this.modelMapper.map(savedDate, MyJourneyResponseDto.class);
    }

    @Override
    public boolean deleteById(int id) {
        MyJourney data = this.repo.findById(id).orElseThrow(() -> new DataNotFoundException("No data found with Id: " + id));
        this.repo.deleteById(data.getId());
        return true;
    }
}
