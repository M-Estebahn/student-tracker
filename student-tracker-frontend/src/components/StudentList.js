import React, { useEffect, useState } from 'react';
import { fetchStudents } from '../api/studentApi';

const StudentList = () => {
    const [students, setStudents] = useState([]);

    useEffect(() => {
        const loadStudents = async () => {
            const data = await fetchStudents();
            setStudents(data);
        };
        loadStudents();
    }, []);

    return (
        <div>
            <h1>Student List</h1>
            <ul>
                {students.map((student) => (
                    <li key={student.id}>
                        {student.name} - {student.phoneNumber}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default StudentList;
