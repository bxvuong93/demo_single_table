package com.demo.test_single_table;

import com.demo.test_single_table.model.*;
import com.demo.test_single_table.repository.ArtPieceRepository;
import com.demo.test_single_table.repository.PaintingRepository;
import com.demo.test_single_table.repository.SculptureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestSingleTableApplication {

    public static void main(String[] args) {

      ConfigurableApplicationContext configurableApplicationContext =
              SpringApplication.run(TestSingleTableApplication.class, args);
        ArtPieceRepository paintingRepository =
                configurableApplicationContext.getBean(PaintingRepository.class);
        ArtPieceRepository sculptureRepository =
                configurableApplicationContext.getBean(SculptureRepository.class);

        ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD, 200.2);
        ArtPiece painting = new Painting("Tom Smith", PaintingTechnique.OIL, 25.5, 45.9);
        sculptureRepository.save(sculpture);
        paintingRepository.save(painting);

    }

}
