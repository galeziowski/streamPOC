package com.epam.streamPOC.dao;

import java.util.List;

import com.epam.streamPOC.domain.City;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public interface CityDao {
	City findCityById(int id);

	City removeCity(City city);

	City addCity(City city);

	City updateCity(City city);

	List<City> findAllCities();

	List<City> findCitiesByCountryCode(String countryCode);
}
