## Contrast Adjustment

This code snippet demonstrates how to perform contrast adjustment on an image using the Python Imaging Library (PIL). The contrast adjustment technique used here is known as linear contrast stretching.

### Requirements

- Python 3.x
- PIL (Python Imaging Library)

You can install the PIL library using the following command:

```
pip install Pillow
```

### Code Explanation

1. Import the necessary module from the PIL library:

```python
from PIL import Image
```

2. Define the `ajustar_contraste` function that takes an image and a contrast factor as input:

```python
def ajustar_contraste(imagem, fator):
    largura, altura = imagem.size
    pixels = imagem.load()

    for x in range(largura):
        for y in range(altura):
            r, g, b = pixels[x, y]

            r = int((r - 128) * fator + 128)
            g = int((g - 128) * fator + 128)
            b = int((b - 128) * fator + 128)

            r = max(0, min(255, r))
            g = max(0, min(255, g))
            b = max(0, min(255, b))

            pixels[x, y] = (r, g, b)

    return imagem
```

3. Specify the path of the image file to be adjusted:

```python
caminho_imagem = '/Computer-Graphics/8-Contrast_Adjustment/girafa.jpeg'
```

4. Open the image using PIL's `Image.open()` function:

```python
imagem = Image.open(caminho_imagem)
```

5. Define the contrast factor:

```python
fator_contraste = 4.5
```

6. Call the `ajustar_contraste` function with the image and contrast factor as arguments to adjust the contrast:

```python
imagem_ajustada = ajustar_contraste(imagem, fator_contraste)
```

7. Generate the path for the adjusted image by replacing the file extension with `_ajustada.jpeg`:

```python
caminho_imagem_ajustada = caminho_imagem.replace('.jpeg', '_ajustada.jpeg')
```

8. Save the adjusted image using PIL's `Image.save()` method:

```python
imagem_ajustada.save(caminho_imagem_ajustada)
```

9. Print the path of the adjusted image:

```python
print("Caminho da imagem ajustada:", caminho_imagem_ajustada)
```

### Usage

1. Replace the `caminho_imagem` variable with the path to your image file.
2. Adjust the `fator_contraste` variable to control the amount of contrast adjustment. Higher values increase the contrast, while lower values decrease it.
3. Run the script and observe the output path of the adjusted image in the console.

Note: Make sure to place the image file in the specified path or adjust the path accordingly.

This code can be helpful for performing contrast adjustments on images for various computer graphics applications.
