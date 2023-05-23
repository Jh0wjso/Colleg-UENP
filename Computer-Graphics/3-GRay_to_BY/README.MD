# Converting Gray to Black and White Image

The provided code demonstrates a function `converter_para_preto_e_branco` in Python that converts a grayscale image to a black and white image. The conversion is based on a specified threshold value.

```python
from PIL import Image

def converter_para_preto_e_branco(caminho_imagem_cinza, limiar):
    # Open the grayscale image
    imagem_cinza = Image.open(caminho_imagem_cinza)

    # Convert the grayscale image to black and white
    imagem_pb = imagem_cinza.point(lambda pixel: 0 if pixel < limiar else 255, '1')

    # Define the path for the black and white image
    caminho_imagem_pb = caminho_imagem_cinza.replace('_cinza.png', '_pb.png')

    # Save the black and white image
    imagem_pb.save(caminho_imagem_pb)

    # Return the path of the black and white image
    return caminho_imagem_pb

# Path of the grayscale image
caminho_imagem_cinza = '/Computer-Graphics/3-GRay_to_BY/carroCinza.jpg'

# Threshold value for black and white conversion
limiar = 128

# Convert the image to black and white
caminho_imagem_pb = converter_para_preto_e_branco(caminho_imagem_cinza, limiar)
print("Caminho da imagem em preto e branco:", caminho_imagem_pb)
```

The code utilizes the Python Imaging Library (PIL) to perform the conversion. Here's a breakdown of how the code works:

1. The code begins by importing the `Image` module from the PIL library.
2. The `converter_para_preto_e_branco` function takes two parameters: `caminho_imagem_cinza`, which represents the path of the grayscale image, and `limiar`, which is the threshold value for the conversion.
3. Inside the function, the grayscale image is opened using `Image.open()` and assigned to the variable `imagem_cinza`.
4. The `point()` method is used to apply a lambda function to each pixel of the grayscale image. The lambda function checks if the pixel value is less than the threshold (`limiar`). If it is, the lambda function returns 0 (black); otherwise, it returns 255 (white). The `'1'` argument specifies that the resulting image should be a bilevel image (black and white).
5. The resulting black and white image is saved using the `save()` method. The path for the black and white image is obtained by replacing the `_cinza.png` portion of the grayscale image path with `_pb.png`.
6. Finally, the function returns the path of the black and white image.
7. The code then defines the path of the grayscale image (`caminho_imagem_cinza`) and the threshold value (`limiar`).
8. The `converter_para_preto_e_branco` function is called with the grayscale image path and the threshold value, and the result is stored in the variable `caminho_imagem_pb`.
9. The path of the black and white image is printed to the console.

Ensure that you have the PIL library installed in your Python environment before running the code using the following command:

```
pip install pillow
```

The resulting black and white image will be saved at the specified path, and its path will be printed to the console.

Note: The code assumes that the grayscale image exists at the provided path, and the path follows a specific naming convention to generate the black and white image path. Make sure to adjust

 the paths and naming conventions as per your requirements.
