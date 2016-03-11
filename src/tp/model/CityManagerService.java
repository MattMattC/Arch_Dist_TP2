package tp.model;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by lock- on 11/03/2016.
 */
@WebService
public interface CityManagerService {
    boolean addCity(City city);
    boolean removeCity(City city);
    List<City> getCities();


}
