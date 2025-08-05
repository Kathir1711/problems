<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Retail Billing System</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Retail Billing System</h1>
        <form id="billingForm">
            <label for="product">Product Name:</label>
            <input type="text" id="product" name="product" required>

            <label for="price">Price:</label>
            <input type="number" id="price" name="price" required>

            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" name="quantity" required>

            <button type="submit">Add to Cart</button>
        </form>

        <h2>Cart</h2>
        <table id="cartTable">
            <thead>
                <tr>
                    <th>Product</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
            </thead>
            <tbody id="cartItems"></tbody>
        </table>

        <div class="total">
            <h3>Total Amount: <span id="totalAmount">0</span></h3>
        </div>

        <button id="checkoutBtn">Checkout</button>
    </div>

    <script src="app.js"></script>
</body>
</html>
