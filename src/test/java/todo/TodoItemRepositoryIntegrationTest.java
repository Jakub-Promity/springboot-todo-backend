package todo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TodoItemRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TodoItemRepository employeeRepository;

    @Test
    public void whenFindAll_thenReturnAll() {
        // given
        TodoItem item1 = new TodoItem();
        TodoItem item2 = new TodoItem();
        entityManager.persist(item1);
        entityManager.persist(item2);
        entityManager.flush();

        // when
        List<TodoItem> found = (List<TodoItem>) employeeRepository.findAll();

        // then
        System.out.println(found);
        assertThat(found.size()).isEqualTo(2);
    }


}