package com.example.series;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.series.entities.Genre;
import com.example.series.entities.Serie;
import com.example.series.repos.SerieRepository;

@SpringBootTest
class MiniProjet1ApplicationTests {
	@Autowired
	private SerieRepository serieRepository;
	@Test
	public void testCreateSerie() {
	
	Serie ser1 = new Serie("chouflihall",1200.500,new Date());
	serieRepository.save(ser1);
	}
	@Test
	public void testFindSerie()
	{
	Serie p = serieRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateSerie()
	{
	Serie p = serieRepository.findById(1L).get();
	p.setPrixSerie(1000.0);
	serieRepository.save(p);
	}
	@Test
	public void testDeleteSerie()
	{
	serieRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousSeries()
	{
	List<Serie> sers = serieRepository.findAll();
	for (Serie p : sers)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testFindSerieByNom()
	{
		List<Serie> sers = serieRepository.findByNomSerie("casa");
		for (Serie p : sers)
		{
		System.out.println(p);
		} }
	@Test
	public void testFindByNomSerieContains ()
	{
	List<Serie> sers=serieRepository.findByNomSerieContains("P");
	for (Serie p : sers)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByNomPrix()
	{
	List<Serie> sers = serieRepository.findByNomPrix("casa", 1000.5);
	for (Serie p : sers)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByGenre()
	{
	Genre gen = new Genre();
	gen.setIdGen(1L);
	List<Serie> sers = serieRepository.findByGenre(gen);
	for (Serie p : sers)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByGenreIdGen()
	{
	List<Serie> sers = serieRepository.findByGenreIdGen(1L);
	for (Serie p : sers)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomSerieAsc()
	{
	List<Serie> sers =
	serieRepository.findByOrderByNomSerieAsc();
	for (Serie p : sers)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierSeriesNomsPrix()
	{
	List<Serie> sers = serieRepository.trierSeriesNomsPrix();
	for (Serie p : sers)
	{
	System.out.println(p);
	}
	}

}
	



