package com.portfolio.my_skill.controllers;

import com.portfolio.my_skill.models.ApiResponse;
import com.portfolio.my_skill.models.MySkillsPayloadDTO;
import com.portfolio.my_skill.models.MySkillsResponseDTO;
import com.portfolio.my_skill.services.MySkillService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/my_skill")
public class MySkillController {
    @Autowired
    private MySkillService service;

    @GetMapping("/get")
    public ResponseEntity<ApiResponse<List<MySkillsResponseDTO>>> getAll() {
        try {
            List<MySkillsResponseDTO> data = this.service.getAll();
            ApiResponse<List<MySkillsResponseDTO>> response = new ApiResponse<>(200, data, "Get Data successfully.");
            return ResponseEntity.ok(response);
        } catch (Exception ex) {
            ApiResponse<List<MySkillsResponseDTO>> response = new ApiResponse<>(500, null, ex.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ApiResponse<MySkillsResponseDTO>> getById(@PathVariable int id) {
        try {
            MySkillsResponseDTO data = this.service.getById(id);
            ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(200, data, "Get Data successfully.");
            return ResponseEntity.ok(response);
        } catch (Exception ex) {
            ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(500, null, ex.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @PostMapping("/add")
    public ResponseEntity<ApiResponse<MySkillsResponseDTO>> addDocs(@Valid @RequestBody MySkillsPayloadDTO saveDto) {
        try {
            MySkillsResponseDTO addedData = this.service.add(saveDto);
            if (addedData == null) {
                ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(400, null, "Bad Request.");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

            }
            ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(200, addedData, "Data Added Successfully.");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception ex) {
            ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(500, null, ex.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponse<MySkillsResponseDTO>> updateConnection(@Valid @RequestBody MySkillsPayloadDTO saveDto, @PathVariable int id) {
        try {
            MySkillsResponseDTO updatedData = this.service.updateById(saveDto, id);
            if (updatedData == null) {
                ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(400, null, "Bad Request.");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
            }
            ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(200, updatedData, "Data Updated Successfully.");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception ex) {
            ApiResponse<MySkillsResponseDTO> response = new ApiResponse<>(500, null, ex.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse<Boolean>> deleteById(@PathVariable int id) {
        try {
            boolean deletedData = this.service.deleteById(id);
            if (deletedData) {
                ApiResponse<Boolean> response = new ApiResponse<>(200, true, "Document Deleted Successfully");
                return ResponseEntity.status(HttpStatus.OK).body(response);
            }
            ApiResponse<Boolean> response = new ApiResponse<>(400, false, "Document not Found on this ID: " + id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        } catch (Exception ex) {
            ApiResponse<Boolean> response = new ApiResponse<>(500, false, ex.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
    
}

