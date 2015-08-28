///////////////////////////////////////////////////////////////////////////
// convert Jsom file from raw folder into sting that can be used to construct JsonObject
//copied from android-topeka sample.
///////////////////////////////////////////////////////////////////////////
private String readCategoriesFromResources() throws IOException {
    StringBuilder categoriesJson = new StringBuilder();
    InputStream rawCategories = mResources.openRawResource(R.raw.categories);
    BufferedReader reader = new BufferedReader(new InputStreamReader(rawCategories));
    String line;

    while ((line = reader.readLine()) != null) {
        categoriesJson.append(line);
    }
    return categoriesJson.toString();
}

///////////////////////////////////////////////////////////////////////////
//
///////////////////////////////////////////////////////////////////////////
