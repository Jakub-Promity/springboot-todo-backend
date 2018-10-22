package todo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todoItem", path = "todoItem")
public interface TodoItemRepository extends PagingAndSortingRepository<TodoItem, Long> {

}
