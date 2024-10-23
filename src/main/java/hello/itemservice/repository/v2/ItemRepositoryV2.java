package hello.itemservice.repository.v2;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.jpa.JpaItemRepositoryV2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositoryV2 extends JpaRepository<Item, Long> {
}
