package todo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "todoItem", path = "todoItem")
@CrossOrigin(origins = "http://localhost:4200")
public interface TodoItemRepository extends PagingAndSortingRepository<TodoItem, Long> {

}
