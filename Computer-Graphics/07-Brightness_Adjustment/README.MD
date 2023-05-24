## README

This repository contains a Python script that adjusts the brightness of an image using the PIL (Python Imaging Library) library. The script allows you to specify a brightness factor and applies it to each pixel of the image to achieve the desired adjustment.

### Prerequisites

- Python 3
- PIL (Python Imaging Library) library

### Installation

1. Clone the repository:

```
git clone https://github.com/your-username/your-repository.git
```

2. Install the required dependencies:

```
pip install pillow
```

### Usage

1. Import the necessary libraries:

```python
from PIL import Image
```

2. Define the `ajustar_brilho` function:

```python
def ajustar_brilho(caminho_imagem, fator):
    # Open the image
    imagem = Image.open(caminho_imagem)

    # Load the pixel data
    pixels = imagem.load()

    # Get the image size
    largura, altura = imagem.size

    # Adjust the brightness of each pixel
    for i in range(largura):
        for j in range(altura):
            r, g, b = pixels[i, j]

            r = int(r * fator)
            g = int(g * fator)
            b = int(b * fator)

            pixels[i, j] = (r, g, b)

    # Save the adjusted image
    caminho_imagem_ajustada = caminho_imagem.replace('.jpeg', '_ajustado.jpeg')
    imagem.save(caminho_imagem_ajustada)

    return caminho_imagem_ajustada
```

3. Adjust the brightness of an image:

```python
caminho_imagem = '/path/to/image.jpg'
fator_brilho = 2.5
caminho_imagem_ajustada = ajustar_brilho(caminho_imagem, fator_brilho)
print("Caminho da imagem ajustada:", caminho_imagem_ajustada)
```

Make sure to replace `'/path/to/image.jpg'` with the actual path to your image file.

The `ajustar_brilho` function takes two parameters: `caminho_imagem`, which represents the path to the image file, and `fator`, which determines the brightness adjustment factor. The function opens the image, accesses the pixel data, and iterates over each pixel to apply the brightness adjustment. Finally, the adjusted image is saved with a new filename and the path is returned.
