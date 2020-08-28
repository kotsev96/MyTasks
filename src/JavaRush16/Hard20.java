package JavaRush16;


interface ImageReader {
}

enum ImageTypes {
    BMP,
    JPG,
    PNG
}

public class Hard20 {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}

class JpgReader implements ImageReader{
}

class PngReader implements ImageReader{

}

class BmpReader implements ImageReader{

}

class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg){
        if(jpg!=null){
            if(jpg.equals(ImageTypes.JPG))
                return new JpgReader();
            if(jpg.equals(ImageTypes.PNG))
                return new PngReader();
            if(jpg.equals(ImageTypes.BMP))
                return new BmpReader();
        }
        else throw new IllegalArgumentException ("Неизвестный тип картинки");
        return null;
    }
}
