package com.demo.test_single_table.repository;

import com.demo.test_single_table.model.ArtPiece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends CrudRepository<ArtPiece, Long> {
}
