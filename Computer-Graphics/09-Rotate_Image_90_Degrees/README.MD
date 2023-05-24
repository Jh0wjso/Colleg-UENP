## Image Rotation Script

This script rotates an image by 90 degrees using the Python `PIL` (Pillow) library. It provides a function `girar_imagem_90_graus` that takes the path of an image file as input, rotates the image by 90 degrees, and saves the rotated image as a new file.

### Dependencies

Before running the script, make sure you have the `PIL` (Pillow) library installed in your Python environment. You can install it using the following command:

```shell
pip install Pillow
```

### Usage

To rotate an image by 90 degrees, you need to call the `girar_imagem_90_graus` function and pass the path of the image file as an argument. The function returns the path of the rotated image file.

```python
from PIL import Image

def girar_imagem_90_graus(caminho_imagem):
    imagem = Image.open(caminho_imagem)

    imagem_girada = imagem.rotate(90, expand=True)

    caminho_imagem_girada = caminho_imagem.replace('.jpg', '_girada.jpg')

    imagem_girada.save(caminho_imagem_girada)

    return caminho_imagem_girada

caminho_imagem = 'path/to/image.jpg'
caminho_imagem_girada = girar_imagem_90_graus(caminho_imagem)
print("Caminho da imagem girada:", caminho_imagem_girada)
```

Replace `'path/to/image.jpg'` with the actual path of the image you want to rotate. The rotated image will be saved in the same directory with the suffix `_girada` added to the original image filename.

Make sure you have write permissions in the directory where the image is located, as well as the directory where the rotated image will be saved.

### Notes

- The script uses the `Image.open` method from `PIL` to open the image file.
- The `rotate` method is called on the `Image` object to rotate the image by 90 degrees.
- The `expand=True` argument is passed to the `rotate` method to ensure the entire image is visible after rotation.
- The rotated image is saved using the `save` method, and the path of the rotated image file is returned by the function.
- The original image file is not modified; instead, a new file is created for the rotated image.

That's it! You can now use this script to rotate images by 90 degrees easily.
