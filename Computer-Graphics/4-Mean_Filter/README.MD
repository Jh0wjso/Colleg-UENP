## Code Explanation: Mean Filter

The provided code implements a mean filter algorithm using the Python Imaging Library (PIL) to filter an image and obtain a smoothed version of it. The mean filter is a popular image processing technique used for noise reduction.

Here's a breakdown of how the code works:

1. Import the necessary libraries:

   ```python
   from PIL import Image
   ```
2. Define the `filtro_media` function:

   ```python
   def filtro_media(imagem, tamanho_janela):
   ```
3. Obtain the width and height of the input image:

   ```python
   largura, altura = imagem.size
   ```
4. Load the pixel data from the input image:

   ```python
   pixels = imagem.load()
   ```
5. Create a new image with the same dimensions as the input image to store the filtered result:

   ```python
   nova_imagem = Image.new("RGB", (largura, altura))
   ```
6. Calculate half the size of the filtering window:

   ```python
   metade_janela = tamanho_janela // 2
   ```
7. Iterate over each pixel in the input image:

   ```python
   for y in range(altura):
       for x in range(largura):
   ```
8. Initialize variables to store the sums of red, green, and blue values, as well as a counter to keep track of the number of pixels considered:

   ```python
   soma_r = 0
   soma_g = 0
   soma_b = 0
   count = 0
   ```
9. Apply the mean filter by looping over a window of pixels centered around the current pixel:

   ```python
   for j in range(-metade_janela, metade_janela + 1):
       for i in range(-metade_janela, metade_janela + 1):
           pixel_x = min(max(x + i, 0), largura - 1)
           pixel_y = min(max(y + j, 0), altura - 1)
           r, g, b = pixels[pixel_x, pixel_y]
           soma_r += r
           soma_g += g
           soma_b += b
           count += 1
   ```
10. Calculate the mean values for red, green, and blue by dividing the sum of values by the number of pixels considered:

    ```python
    media_r = soma_r // count
    media_g = soma_g // count
    media_b = soma_b // count
    ```
11. Set the corresponding pixel in the new image with the calculated mean values:

    ```python
    nova_imagem.putpixel((x, y), (media_r, media_g, media_b))
    ```
12. Return the filtered image:

    ```python
    return nova_imagem
    ```
13. Define the path to the input image:

    ```python
    caminho_imagem = 'Computer-Graphics/4-Mean_Filter/pessoa.jpg'
    ```
14. Open the input image:

    ```python
    imagem = Image.open(caminho_imagem)
    ```
15. Specify the size of the filtering window:

    ```python
    tamanho_janela = 5
    ```
16. Apply the mean filter to the input image:

    ```python
    imagem_filtrada = filtro_media(imagem, tamanho_janela)
    ```
17. Define the path for the filtered image by replacing the file extension:

    ```python
    caminho_imagem_filtrada = caminho_imagem.replace('.jpg', '_filtrada.jpg')
    ```
18. Save the filtered

 image:
    ``python     imagem_filtrada.save(caminho_imagem_filtrada)     ``

19. Print the path of the filtered image:
    ```python
    print("Caminho da imagem filtrada:", caminho_imagem_filtrada)
    ```

The code reads an input image, applies a mean filter with a specified window size, saves the filtered image, and outputs the path of the filtered image. The mean filter helps to reduce noise and obtain a smoother version of the original image.
