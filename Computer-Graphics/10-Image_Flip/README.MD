# Image Flip

This code demonstrates how to flip an image horizontally and vertically using the Python Imaging Library (PIL).

## Requirements

- Python 3.x
- PIL (Pillow) library

## Installation

To run this code, make sure you have Python 3.x installed. You can install the required `PIL` library by running the following command:

```shell
pip install Pillow
```

## Usage

```python
from PIL import Image

def inverter_imagem_horizontal(caminho_imagem):
    imagem = Image.open(caminho_imagem)
    imagem_invertida = imagem.transpose(Image.FLIP_LEFT_RIGHT)
    caminho_imagem_invertida_h = caminho_imagem.replace('.jpg', '_invertida_h.jpg')
    imagem_invertida.save(caminho_imagem_invertida_h)
    return caminho_imagem_invertida_h

def inverter_imagem_vertical(caminho_imagem):
    imagem = Image.open(caminho_imagem)
    imagem_invertida = imagem.transpose(Image.FLIP_TOP_BOTTOM)
    caminho_imagem_invertida_v = caminho_imagem.replace('.jpg', '_invertida_v.jpg')
    imagem_invertida.save(caminho_imagem_invertida_v)
    return caminho_imagem_invertida_v

caminho_imagem = 'Computer-Graphics/10-Image_Flip/dog.jpg'

# Invert image horizontally
caminho_imagem_invertida_h = inverter_imagem_horizontal(caminho_imagem)
print("Caminho da imagem invertida horizontalmente:", caminho_imagem_invertida_h)

# Invert image vertically
caminho_imagem_invertida_v = inverter_imagem_vertical(caminho_imagem)
print("Caminho da imagem invertida verticalmente:", caminho_imagem_invertida_v)
```

This code provides two functions `inverter_imagem_horizontal` and `inverter_imagem_vertical` that can be used to flip an image horizontally and vertically, respectively. The code uses the PIL library to open the image, transpose it using the appropriate transformation method (`transpose`), and save the inverted image to a new file with the suffix `_invertida_h` for horizontal inversion and `_invertida_v` for vertical inversion.

To use this code, you need to provide the path to the input image (`caminho_imagem`). After running the code, it will print the paths of the horizontally and vertically inverted images.

Make sure to replace the `caminho_imagem` variable with the actual path to your image file before executing the code.

Feel free to modify and customize the code according to your specific requirements.
