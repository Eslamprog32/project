package com.example.lastone.repository;

import com.example.lastone.model.entity.XRayEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface XRayRepo extends JpaRepository<XRayEntity, Long> {
    List<XRayEntity> findAllByPatientName(String patientName);
}
