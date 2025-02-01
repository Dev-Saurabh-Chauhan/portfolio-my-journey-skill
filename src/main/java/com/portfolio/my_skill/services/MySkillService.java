package com.portfolio.my_skill.services;
import com.portfolio.my_skill.models.MySkillsPayloadDTO;
import com.portfolio.my_skill.models.MySkillsResponseDTO;
import java.util.List;

public interface MySkillService {
    List<MySkillsResponseDTO> getAll();
    MySkillsResponseDTO getById(int id);
    MySkillsResponseDTO add(MySkillsPayloadDTO payloadDTO);
    MySkillsResponseDTO updateById(MySkillsPayloadDTO payloadDTO,int id);
    boolean deleteById(int id);

}
