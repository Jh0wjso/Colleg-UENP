function filtraElementosPares(arr){
    if(!arr || ! arr.length) return;
    
    const newArray = arr.filter((item) => item % 2 === 0);

    return newArray;
}

console.log(filtraElementosPares([1, 2, 4, 5, 6]));