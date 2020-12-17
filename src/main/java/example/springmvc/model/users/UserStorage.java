package example.springmvc.model.users;

/**
 * Storage for user data. This is the interface for the DAO layer.
 * 
 *
 */
public interface UserStorage {
	
	public User byId(String id);

	public void saveOrUpdate(User user);
}
