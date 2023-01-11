
Q:https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1


let n = 1;
let arr = [9];

  const rearrange =(arr, n) => {
    //code here
      let arr1 = [];
      let arr2 = [];
    for (let i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
          arr1.push(arr[i]);
      }
    }
       for (let i = 0; i < arr.length; i++) {
         if (arr[i] >= 0) {
           arr2.push(arr[i]);
         }
       }
    //   for (let i; i < arr.length; i++){
    //       arr.pop();
    //   }
      arr.length = 0;
      console.log(arr);
      let i=0, j = 0;
      while (i < arr2.length || j < arr1.length) {
          if(i < arr2.length) {
              arr.push(arr2[i]);
              i++;
          }
          if(j < arr1.length) {
            arr.push(arr1[j]);
            j++;
          }
          return arr;
      }

      console.log(arr1);
      console.log(arr2);
  }
rearrange(arr, 9);

      console.log(arr);
