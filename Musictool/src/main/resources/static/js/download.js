// This is an example JSON object
const exampleJson = {
  name: "John Doe",
  age: 30,
  email: "johndoe@example.com"
};

// Convert the JSON object to a string
const jsonString = JSON.stringify(exampleJson);

// Create a new blob with the JSON string
const jsonBlob = new Blob([jsonString], { type: "application/json" });

// Create a URL for the blob
const jsonUrl = URL.createObjectURL(jsonBlob);

// Create a new link element to download the JSON file
const downloadLink = document.createElement("a");
downloadLink.href = jsonUrl;
downloadLink.download = "example.json";

// Click the link to start the download
document.body.appendChild(downloadLink);
downloadLink.click();

// Cleanup: remove the link and revoke the URL object
document.body.removeChild(downloadLink);
URL.revokeObjectURL(jsonUrl);
