package sesac_3rd.sesac_3rd.service.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sesac_3rd.sesac_3rd.dto.chat.ChatRoomDTO;
import sesac_3rd.sesac_3rd.entity.ChatRoom;
import sesac_3rd.sesac_3rd.entity.Meeting;
import sesac_3rd.sesac_3rd.exception.CustomException;
import sesac_3rd.sesac_3rd.exception.ExceptionStatus;
import sesac_3rd.sesac_3rd.handler.pagination.PaginationResponseDTO;
import sesac_3rd.sesac_3rd.mapper.chat.ChatRoomMapper;
import sesac_3rd.sesac_3rd.repository.MeetingRepository;
import sesac_3rd.sesac_3rd.repository.chat.ChatRoomRepository;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;
    private final ChatRoomMapper chatRoomMapper;
    private final MeetingRepository meetingRepository;



    // 유저 소속 채팅방 목록 조회
    public PaginationResponseDTO<ChatRoomDTO.ChatRoomList> getChatRooms(Long userId, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        Page<ChatRoom> chatPage = chatRoomRepository.findByUserId(userId, pageRequest);

        ChatRoomDTO.ChatRoomList chatRoomList = chatRoomMapper.ChatRoomListToChatRoomListResponseDTO(
                userId,
                chatPage.getContent(),
                chatPage.getNumber() + 1,
                chatPage.getSize(),
                chatPage.getTotalPages()
        );

        return new PaginationResponseDTO<>(chatRoomList, chatPage);

    }

    // 채팅방 생성
    public void createChatRoomIfNotExists(Long meetingId) {

        // Meeting 의 ChatRoom 존재 여부 확인
        boolean chatRoomExists = chatRoomRepository.existsByMeeting_MeetingId(meetingId);

        if (!chatRoomExists) {
            Meeting meeting = meetingRepository.findById(meetingId)
                    .orElseThrow(() -> new CustomException(ExceptionStatus.MEETING_NOT_FOUND));

            ChatRoom chatRoom = new ChatRoom();
            chatRoom.setMeeting(meeting);
            chatRoom.setIsActive(true);

            chatRoomRepository.save(chatRoom);
        }
    }
}