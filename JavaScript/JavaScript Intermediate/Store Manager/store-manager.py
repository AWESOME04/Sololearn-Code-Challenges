function main() {
  var increase = parseInt(readLine(), 10);
  var prices = [98.99, 15.2, 20, 1026];

  // Increase prices by the given amount
  var increasedPrices = prices.map(function (price) {
    return price + increase;
  });

  // Output the resulting array
  console.log(increasedPrices);
}
