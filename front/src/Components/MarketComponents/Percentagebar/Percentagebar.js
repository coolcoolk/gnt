import React from 'react';
import './Percentagebar.css';
//testdata
import testtopicsdata from "../../../testdb/topics.json"

export default function Percentagebar() {
    let agreeWidth = (testtopicsdata.topics[0].bet_info[0].coin/(testtopicsdata.topics[0].bet_info[0].coin+testtopicsdata.topics[0].bet_info[1].coin)).toFixed(2)*100
    let disagreeWidth = 100 - agreeWidth
    let agreeStyle = {width: `${agreeWidth}%` }
    let disagreeStyle = {width: `${disagreeWidth}%` }

    return(
        <div className='wholebox'>
            <div className='agreedbox' style={ agreeStyle }>
                { agreeWidth }%
            </div>
            <div className='disagreedbox' style={ disagreeStyle }>
                { disagreeWidth }%
            </div>
            <script>
            </script>
        </div>
        
    )
}