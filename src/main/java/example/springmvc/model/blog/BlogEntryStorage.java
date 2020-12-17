package example.springmvc.model.blog;

import java.util.List;


public interface BlogEntryStorage {

	public BlogEntry byId(String id);
	
	public void saveOrUpdate(BlogEntry entry);
	
	public List<BlogEntry> findAll();
}
