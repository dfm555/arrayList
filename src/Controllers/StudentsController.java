package Controllers;

import Entities.Students;
import Interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by monicaramirez on 8/10/15.
 */
public class StudentsController implements IStudent {

    List<Students> listAllStudent = new ArrayList<Students>();
    List<Students> filterList = new ArrayList<Students>();
    public StudentsController() {
    }

    @Override
    public boolean saveStudent(Students students) {
        boolean status = true;
        try {
            listAllStudent.add(students);
        }catch (Exception e){
            status = false;
        }
        return status;
    }

    @Override
    public boolean deleteStudent( int row) {
        boolean status = true;
        try {
            listAllStudent.remove(row);
        }catch (Exception e) {
            status = false;
        }
        return status;
    }

    @Override
    public List<Students> listStudents() {
        return listAllStudent;
    }

    public List<Students> listFilters() {
        return filterList;
    }

    public void filter(String... filters /* name, String career, String credits, String average*/) {
        try {
        	if (filters != null && filters.length > 0) {
        		filterList.clear();
        		
        		Boolean hasName = Boolean.FALSE;
        		Boolean hasCareer = Boolean.FALSE;
        		Boolean hasCredits = Boolean.FALSE;
        		Boolean hasAverage = Boolean.FALSE;
        		
        		if (!filters[0].isEmpty()) hasName = Boolean.TRUE;
        		if (!filters[1].isEmpty()) hasCareer = Boolean.TRUE;
        		if (!filters[2].isEmpty()) hasCredits = Boolean.TRUE;
        		if (!filters[3].isEmpty()) hasAverage = Boolean.TRUE;
        		
        		if (hasName) {
        			if (hasCareer) {
        				if (hasCredits) {
        					if (hasAverage) {
        						for (Students student : listAllStudent) {
        	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
        	        						student.getCareer().toLowerCase().contains(filters[1].toLowerCase()) &&
        	        						String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2])) && 
        	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
        	        					filterList.add(student);
        	        				}
        	        			}
        					} else {
        						for (Students student : listAllStudent) {
        	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
        	        						student.getCareer().toLowerCase().contains(filters[1].toLowerCase()) &&
        	        						String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2]))) {
        	        					filterList.add(student);
        	        				}
        	        			}
        					}
        				} else if (hasAverage) {
        					for (Students student : listAllStudent) {
    	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
    	        						student.getCareer().toLowerCase().contains(filters[1].toLowerCase()) &&
    	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
    	        					filterList.add(student);
    	        				}
    	        			}
    					} else {
    						for (Students student : listAllStudent) {
    	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
    	        						student.getCareer().toLowerCase().contains(filters[1].toLowerCase())) {
    	        					filterList.add(student);
    	        				}
    	        			}
    					}
        			} else if (hasCredits) {
    					if (hasAverage) {
    						for (Students student : listAllStudent) {
    	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
    	        						String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2])) && 
    	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
    	        					filterList.add(student);
    	        				}
    	        			}
    					} else {
    						for (Students student : listAllStudent) {
    	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
    	        						String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2]))) {
    	        					filterList.add(student);
    	        				}
    	        			}
    					}
    				} else if (hasAverage) {
    					for (Students student : listAllStudent) {
	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase()) &&
	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
	        					filterList.add(student);
	        				}
	        			}
					} else {
						for (Students student : listAllStudent) {
	        				if (student.getName().toLowerCase().contains(filters[0].toLowerCase())) {
	        					filterList.add(student);
	        				}
	        			}
					}
        		} else if (hasCareer) {
        			if (hasCredits) {
    					if (hasAverage) {
    						for (Students student : listAllStudent) {
    	        				if (student.getCareer().toLowerCase().contains(filters[1].toLowerCase()) &&
    	        						String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2])) && 
    	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
    	        					filterList.add(student);
    	        				}
    	        			}
    					} else {
    						for (Students student : listAllStudent) {
    	        				if (student.getCareer().toLowerCase().contains(filters[1].toLowerCase()) &&
    	        						String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2]))) {
    	        					filterList.add(student);
    	        				}
    	        			}
    					}
    				} else if (hasAverage) {
    					for (Students student : listAllStudent) {
	        				if (student.getCareer().toLowerCase().contains(filters[1].toLowerCase()) &&
	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
	        					filterList.add(student);
	        				}
	        			}
					} else {
						for (Students student : listAllStudent) {
	        				if (student.getCareer().toLowerCase().contains(filters[1].toLowerCase())) {
	        					filterList.add(student);
	        				}
	        			}
					}
        		} else if (hasCredits) {
        			if (hasAverage) {
        				for (Students student : listAllStudent) {
	        				if (String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2])) && 
	        						String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
	        					filterList.add(student);
	        				}
	        			}
					} else {
						for (Students student : listAllStudent) {
	        				if (String.valueOf(student.getNumberCreditsApprove()).equals(String.valueOf(filters[2]))) {
	        					filterList.add(student);
	        				}
	        			}
					}
        		} else if (hasAverage) {
        			for (Students student : listAllStudent) {
        				if (String.valueOf(student.getAverage()).equals(String.valueOf(filters[3]))) {
        					filterList.add(student);
        				}
        			}
        		}
        	}
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}