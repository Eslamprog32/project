package com.example.lastone.model.mapper;

import com.example.lastone.model.dto.ResponseAsListDTO;
import com.example.lastone.model.entity.TestsEntity;
import com.example.lastone.model.entity.XRayEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class XRayMapperIm {

    public ResponseAsListDTO toXRayAsListDto(XRayEntity xRay) {
        if (xRay == null) {
            return null;
        }

        ResponseAsListDTO.ResponseAsListDTOBuilder xRayAsListDTO = ResponseAsListDTO.builder();
        xRayAsListDTO.id(xRay.getXRayId());
        xRayAsListDTO.category(xRay.getCategory());
        xRayAsListDTO.createdAt(xRay.getCreatedAt());
        return xRayAsListDTO.build();
    }

    public ResponseAsListDTO toXRayAsListDto(TestsEntity tests) {
        if (tests == null) {
            return null;
        }
        ResponseAsListDTO.ResponseAsListDTOBuilder testsAs = ResponseAsListDTO.builder();
        testsAs.id(tests.getID());
        testsAs.category(tests.getCategory());
        testsAs.createdAt(tests.getCreatedAt());
        return testsAs.build();
    }
}
