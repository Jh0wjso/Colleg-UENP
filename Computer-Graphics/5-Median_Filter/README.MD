## Code Explanation - Median Filter

The provided code implements a median filter using the Python Imaging Library (PIL) to process an image. The median filter is a commonly used image processing technique that helps reduce noise while preserving edges and details.

Here is a step-by-step breakdown of the code:

1. Importing the Required Libraries:

   ```python
   from PIL import Image
   ```

   The code starts by importing the `Image` class from the `PIL` library, which provides various image processing functionalities.
2. Defining the Median Filter Function:

   ```python
   def filtro_mediana(imagem):
       largura, altura = imagem.size
       pixels = imagem.load()

       for x in range(1, largura-1):
           for y in range(1, altura-1):
               vizinhos = [
                   pixels[x-1, y-1], pixels[x, y-1], pixels[x+1, y-1],
                   pixels[x-1, y], pixels[x, y], pixels[x+1, y],
                   pixels[x-1, y+1], pixels[x, y+1], pixels[x+1, y+1]
               ]
               mediana = sorted(vizinhos)[4]
               pixels[x, y] = mediana

       return imagem
   ```

   The `filtro_mediana` function takes an input `imagem` (image) and applies the median filter to it. The function iterates over each pixel of the image (excluding the border pixels) using two nested loops.

   For each pixel, the function collects the values of its surrounding pixels (including itself) and stores them in the `vizinhos` (neighbors) list. The `vizinhos` list contains a total of 9 pixels.

   The median value is computed by sorting the `vizinhos` list and selecting the middle element (index 4) as the median. This value represents the filtered intensity for the current pixel.

   Finally, the function assigns the median value to the current pixel, effectively applying the median filter. The filtered image is then returned.
3. Loading and Filtering the Image:

   ```python
   caminho_imagem = '/Computer-Graphics/5-Median_Filter/pessoa.jpg'
   imagem = Image.open(caminho_imagem)

   imagem_filtrada = filtro_mediana(imagem)
   ```

   The code specifies the path to the input image file (`caminho_imagem`) and uses the `Image.open()` method to load the image as an `Image` object (`imagem`).

   The `filtro_mediana` function is called with the loaded image, and the result is stored in the `imagem_filtrada` variable.
4. Saving the Filtered Image:

   ```python
   caminho_imagem_filtrada = caminho_imagem.replace('.jpg', '_filtrada.jpg')
   imagem_filtrada.save(caminho_imagem_filtrada)
   ```

   The code creates a new file path (`caminho_imagem_filtrada`) by replacing the file extension of the original image path with `_filtrada.jpg`. This new path represents the file path for the filtered image.

   The `save()` method is then used to save the filtered image to the specified path.
5. Printing the Path of the Filtered Image:

   ```python
   print("Caminho da imagem filtrada:", caminho_imagem_filtrada)
   ```

   Finally, the code prints the path of the filtered image, indicating the location where the filtered image file has been saved.

The code demonstrates a straightforward implementation of the median filter using the PIL library in Python. By applying the median filter to an

 image, the code helps reduce noise and enhance the image's visual quality.

Note: Make sure to provide the correct image file path (`caminho_imagem`) to run the code successfully.
