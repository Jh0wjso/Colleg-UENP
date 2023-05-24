# Code Explanation

The provided code demonstrates how to separate the color channels (red, green, and blue) of an image using the OpenCV library in Python. Here's a breakdown of the code:

```python
import cv2
```

We import the OpenCV library, which provides various functions for image processing and computer vision tasks.

```python
def separar_canais(imagem):
    canal_vermelho = imagem[:, :, 2] 
    canal_verde = imagem[:, :, 1] 
    canal_azul = imagem[:, :, 0] 
    return canal_vermelho, canal_verde, canal_azul
```

The `separar_canais` function takes an image as input and returns the individual color channels (red, green, and blue) of the image. The image is represented as a NumPy array, where the dimensions represent rows, columns, and color channels. By slicing the array, we extract each color channel separately.

```python
imagem = cv2.imread("/Computer-Graphics/1-RGB/rgbImage.png")
```

We load an image from the specified file path using the `imread` function from OpenCV. The image is stored in the `imagem` variable. If there is an error loading the image, an error message is printed, and the program exits.

```python
vermelho, verde, azul = separar_canais(imagem)
```

We call the `separar_canais` function to obtain the individual color channels of the image. The returned channels are assigned to the variables `vermelho` (red), `verde` (green), and `azul` (blue).

```python
cv2.imshow('Canal Vermelho', vermelho)
cv2.imshow('Canal Verde', verde)
cv2.imshow('Canal Azul', azul)
cv2.imshow('Imagem original', imagem)
```

We use the `imshow` function to display the color channels and the original image. The first argument is a string that represents the window name, and the second argument is the image or channel to be displayed.

```python
while cv2.waitKey(1) != ord('q'):
    pass
```

This loop waits for a keyboard event. It continues looping until the user presses the 'q' key, as indicated by the `ord('q')` condition.

```python
cv2.destroyAllWindows()
```

Finally, we use the `destroyAllWindows` function to close all open windows and release system resources related to the displayed images.

This code provides a simple example of how to separate color channels using OpenCV and display them alongside the original image.
