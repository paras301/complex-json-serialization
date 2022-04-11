# complex-json-serialization

Reference: https://www.baeldung.com/jackson-vs-gson

This simple github project shows various options for parsing JSON files using JAVA.
With GSON and JACKSON, whole json can be deserialized into a JAVA object. I used a nested java object here to simply the structure.
The JAVA object can be serialized back to JSON as well.

With JsonPath and JsonFlattener is more to get the quick values from JSON. They are good if you want to de-serialize only a part of JSON and do some processing on that.