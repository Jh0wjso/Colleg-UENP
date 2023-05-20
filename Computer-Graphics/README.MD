
# Image Processing Script Collection

This repository contains a collection of Python scripts for image processing, with various functionalities available. The implementation was done using the Python language, but you can adapt the code to another language of your choice if desired.

## Implemented Functionalities

### Color Processing

* **1 - Separation of R, G, and B Channels:** This script allows you to separate the red (R), green (G), and blue (B) color channels of a color image, generating three different images corresponding to each channel.
* **2 - RGB to Grayscale Conversion:** With this script, you can convert a color image to a grayscale image. The conversion is performed using the weighted average of the R, G, and B channels to obtain the intensity of each pixel.
* **3 - Grayscale to Black and White Conversion (Manual Thresholding/Binarization):** This script allows you to convert a grayscale image to a binary black and white image. Binarization is done by manually defining a threshold, where pixels below the threshold are considered black and pixels above are considered white.

### Filters

* **4 - Mean Filter:** This script applies the mean filter to an image, replacing the value of each pixel with the average of the neighboring pixel values. This results in a smoothing effect on the image.
* **5 - Median Filter:** With this script, you can apply the median filter to an image, replacing the value of each pixel with the median value of the neighboring pixels. This filter is effective in removing noise and preserving edges.
* **6 - Gaussian Blur Filter:** This script performs Gaussian blur on an image, which is a filter used to smooth the image and reduce noise. The blur is achieved by applying convolution with a Gaussian kernel to the image.

### Adjustments

* **7 - Brightness Adjustment:** With this script, you can adjust the brightness of an image by increasing or decreasing its overall intensity. The adjustment is done by adding or subtracting a constant value from all pixels.
* **8 - Contrast Adjustment:** This script allows you to adjust the contrast of an image by amplifying or reducing the difference between pixel intensity values. The adjustment is achieved by applying a linear transformation to the intensity values.

### Transformations

* **9 - Rotate Image 90 Degrees:** With this script, you can rotate an image 90 degrees clockwise. The pixels are rearranged to create a new rotated image.
* **10 - Image Flip (Horizontal/Vertical):** This script performs image flipping, both horizontally and vertically. The resulting image is a symmetrical reflection of the original image.

## How to Use

In the repository, you will find individual scripts for each functionality, as well as usage examples and a small documentation written in Markdown explaining the implementation of each filter.

Feel free to explore and use the code according to your needs. If you have any questions or suggestions, do not hesitate to contact us.

## 🛠️ Tools Used

* [Python](https://docs.python.org/3/) - Programming Language
* [OpenCV](https://pypi.org/project/opencv-python/) - Python Library
* [Pillow](https://pillow.readthedocs.io/en/stable/) - Python Library

## ✒️ Author

* **Developed** by [Jh0wjso](https://github.com/Jh0wjso).
