package test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageTest {

	@Test
	public void test() {
		try {
			BufferedImage image=ImageIO.read(this.getClass().getResourceAsStream(""));
			Assertions.assertNotNull(image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
