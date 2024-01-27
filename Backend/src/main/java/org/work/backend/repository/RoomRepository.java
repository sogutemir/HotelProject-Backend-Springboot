package org.work.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.work.backend.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
}
