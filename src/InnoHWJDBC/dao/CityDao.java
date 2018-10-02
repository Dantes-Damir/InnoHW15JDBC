package InnoHWJDBC.dao;

import InnoHWJDBC.pojo.City;

public interface CityDao {
    public boolean addCity(City city);

    public City getCityById(int id);

    public boolean update(City city);

    public boolean deleteCityById(int id);

    public boolean deleteCityByName(City city);
}
