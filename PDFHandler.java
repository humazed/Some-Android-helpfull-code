
///////////////////////////////////////////////////////////////////////////
// method to open PDF files va intent
///////////////////////////////////////////////////////////////////////////

String dir="/Attendancesystem";

public void displaypdf() {

  File file = null;
  file = new File(Environment.getExternalStorageDirectory()+dir+ "/sample.pdf");
  Toast.makeText(getApplicationContext(), file.toString() , Toast.LENGTH_LONG).show();
  if(file.exists()) {
    Intent target = new Intent(Intent.ACTION_VIEW);
    target.setDataAndType(Uri.fromFile(file), "application/pdf");
    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

    Intent intent = Intent.createChooser(target, "Open File");
    try {
      startActivity(intent);
    } catch (ActivityNotFoundException e) {
      // Instruct the user to install a PDF reader here, or something
    }
  }
  else
  Toast.makeText(getApplicationContext(), "File path is incorrect." , Toast.LENGTH_LONG).show();
}

///////////////////////////////////////////////////////////////////////////
// convert file to byte[] in java7 from : http://stackoverflow.com/questions/858980/file-to-byte-in-java
///////////////////////////////////////////////////////////////////////////

import java.nio.file.Files;
import java.io.File;

File fi = new File("myfile.jpg");
byte[] fileContent = Files.readAllBytes(fi.toPath())

///////////////////////////////////////////////////////////////////////////
// convert file to byte[] in java7 in one line
///////////////////////////////////////////////////////////////////////////

byte[] array = Files.readAllBytes(new File("/path/to/file").toPath());
