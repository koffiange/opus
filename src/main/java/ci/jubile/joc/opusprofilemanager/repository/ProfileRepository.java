package ci.jubile.joc.opusprofilemanager.repository;


import ci.jubile.joc.opusprofilemanager.domain.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
