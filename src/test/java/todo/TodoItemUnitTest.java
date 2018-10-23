package todo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class TodoItemUnitTest {

    @Test
    public void whenConstructed_fieldsAreEmpty() throws Exception {
        TodoItem item = new TodoItem();
        assertThat(item.getContent()).isEqualTo(null);
        assertThat(item.getRank()).isEqualTo(0);
        assertThat(item.getId()).isEqualTo(0);
    }

}
