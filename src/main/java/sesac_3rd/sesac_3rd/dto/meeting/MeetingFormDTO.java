package sesac_3rd.sesac_3rd.dto.meeting;

import lombok.*;
import sesac_3rd.sesac_3rd.constant.MeetingStatus;
import sesac_3rd.sesac_3rd.entity.MeetingCategory;
import sesac_3rd.sesac_3rd.entity.Place;
import sesac_3rd.sesac_3rd.entity.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// 모임 생성, 모임 수정
public class MeetingFormDTO {
    private Long userId;  // 모임장 ID
    private Long placeId;  // 장소 ID
    private Long meetingCategoryId;  // 모임 카테고리 ID

    private String meetingTitle;  // 모임명
    private String meetingContent;  // 모임내용
    private int totalCapacity;  // 총원 (최대 99)
    private boolean isLimited = false;  // 총원 제한 여부 (기본값 FALSE)
    private boolean isAuthType = false;  // 인증 여부 (기본값 FALSE)
    private int capacity = 1;  // 현재 참가 인원
    private String meetingLocation;  // 모임 장소
    private BigDecimal latitude;  // 위도
    private BigDecimal longitude;  // 경도
    private LocalDateTime meetingTime;  // 모임 일시
    private MeetingStatus meetingStatus = MeetingStatus.ONGOING;  // 모임 상태 (기본값 "ONGOING")
}
