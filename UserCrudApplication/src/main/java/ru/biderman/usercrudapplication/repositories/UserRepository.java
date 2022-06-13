package ru.biderman.usercrudapplication.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.biderman.usercrudapplication.domain.UserDocument;

@RepositoryRestResource(
        path = "users"
)
public interface UserRepository extends MongoRepository<UserDocument, String> {
}
