// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.tuyucheng.taketoday.service.api;

import cn.tuyucheng.taketoday.domain.Book;
import cn.tuyucheng.taketoday.service.api.BookService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect BookService_Roo_Service {
    
    declare parents: BookService extends EntityResolver<Book, Long>;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Book
     */
    public abstract Book BookService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param book
     */
    public abstract void BookService.delete(Book book);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<Book> BookService.save(Iterable<Book> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void BookService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Book
     */
    public abstract Book BookService.save(Book entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Book
     */
    public abstract Book BookService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<Book> BookService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<Book> BookService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long BookService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Book> BookService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
}
