package groovy_and_grails_example.groovy_example.section_4

import java.sql.Date as SqlDate

def date = new Date() // java.util.Date
def sqlDate = new SqlDate(date.time)

assert date == sqlDate
