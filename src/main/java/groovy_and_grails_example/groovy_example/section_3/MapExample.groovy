package groovy_and_grails_example.groovy_example.section_3

// Map
// by default all map in groovy is LinkedHashMap
def map = [name:'Java', age: 30, id:1200]
assert map.getClass() == LinkedHashMap
assert map.class == null // it is using key 'class'

map = [1:'1',2:'2',1:'3']
assert map == [2:'2',1:'3']

// get in map
def map2 = [name:'Java', age: 30, id:1200]
assert map2.name == 'Java'
assert map2['name'] == 'Java'
assert map2.get('name') == 'Java'
assert map2.getAt('name') == 'Java'
// return default value
assert map2.get('title','NoTitle') == 'NoTitle'

// put in map
map2["title"] = 'Sun'
map2.put("country","USA")
map2.putAt("state",'AZ')
assert map2 == [name:'Java', age:30, id:1200, title:'Sun', country:'USA', state:'AZ']

// remove from map
map2.remove('title')
assert map2 == [name:'Java', age:30, id:1200, country:'USA', state:'AZ']

// change value in map
map2.id = map2.id + 150
assert map2 == [name:'Java', age:30, id:1350, country:'USA', state:'AZ']

def lang = "ukrainian"
def country = "Ukraine"
def map3 =  [(lang):country]
assert map3 == [ukrainian:"Ukraine"]
assert map3.containsValue("Ukraine")
assert map3.containsKey("ukrainian")
assert map3.keySet().toList() == ["ukrainian"]
assert map3.values().toList() == ["Ukraine"]