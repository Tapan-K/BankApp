<!DOCTYPE html>
<html>
<head>
  <title>Simple Banking Application</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f5f5f5;
      padding: 20px;
    }

    h1 {
      font-size: 36px;
      color: #333333;
    }

    h2 {
      font-size: 24px;
      color: #333333;
      margin-bottom: 10px;
    }

    p {
      color: #555555;
    }

    code {
      background-color: #f5f5f5;
      padding: 2px 4px;
      border-radius: 4px;
      font-family: Consolas, monospace;
    }

    .feature {
      margin-bottom: 20px;
    }

    .example {
      margin-bottom: 20px;
      background-color: #ffffff;
      border-radius: 4px;
      padding: 20px;
    }
  </style>
</head>
<body>
  <h1>Simple Banking Application</h1>

  <div class="feature">
    <h2>Features &#128161;</h2>
    <ul>
      <li>Check Balance: Users can check their account balance to view the available funds.</li>
      <li>Deposit: Users can deposit a specified amount into their account.</li>
      <li>Withdraw: Users can withdraw a specified amount from their account.</li>
      <li>Exit: Users can choose to exit the application.</li>
    </ul>
  </div>

  <div class="feature">
    <h2>Getting Started &#128073;</h2>
    <ol>
      <li>Clone the repository:</li>
      <code>git clone &lt;repository-url&gt;</code>
      <li>Compile the Java source files:</li>
      <code>javac BankingApplication.java BankAccount.java</code>
      <li>Run the application:</li>
      <code>java BankingApplication</code>
    </ol>
  </div>

  <div class="feature">
    <h2>Usage &#128202;</h2>
    <ol>
      <li>Upon running the application, you will be presented with a menu of options.</li>
      <li>Enter the corresponding number for the desired operation.</li>
      <li>Follow the prompts and provide the necessary information, such as deposit/withdrawal amounts.</li>
      <li>The application will perform the requested operation and provide appropriate feedback.</li>
      <li>Repeat steps 2-4 as needed.</li>
      <li>To exit the application, select the "Exit" option from the menu.</li>
    </ol>
  </div>

  <h3Contributing</h3>
  <p>Contributions are welcome! If you have any suggestions or improvements for the project, please open an issue or submit a pull request.</p>

  <h3License</h3>
  <p>This project is licensed under the MIT License.</p>

  <div class="example">
    <h2>Example &#128293;</h2>
    <pre>
Welcome to the Banking Application

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 2
Enter the amount to deposit: 100.50
Amount deposited successfully.

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 1
Current Balance: 100.50

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 3
Enter the amount to withdraw: 50.25
Amount withdrawn successfully.

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
