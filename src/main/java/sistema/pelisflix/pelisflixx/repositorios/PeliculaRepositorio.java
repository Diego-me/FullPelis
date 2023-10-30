package sistema.pelisflix.pelisflixx.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.pelisflix.pelisflixx.modelo.pelicula;

public interface PeliculaRepositorio extends JpaRepository<pelicula, Integer> {

}
