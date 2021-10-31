package com.prgrms.broong.management.park.dto;

import com.prgrms.broong.management.park.domain.Location;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ParkRequestDto {

    private Integer possibleNum;

    private Location location;

}
